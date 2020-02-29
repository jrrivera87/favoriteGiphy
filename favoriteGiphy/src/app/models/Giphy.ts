/*
  This is the basic object of the GIPHY response api.
 */
export class Giphy {
  type: string;
  id: string;
  url: string;
  'import_datetime': string;
  'trending_datetime': string;
  images: {
    original: {
      frames: string;
      hash: string;
      height: string;
      mp4: string;
      mp4_size: string;
      size: string;
      url: string;
      webp: string;
      webp_size: string;
      width: string;
    }
  };
}


